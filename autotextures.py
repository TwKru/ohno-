import os
import re

# ================= НАСТРОЙКИ СТРУКТУРЫ =================
MOD_ID = "ohnomod"

# Пути к Java-файлам
ITEMS_JAVA = "src/main/java/com/ohno/ohnomod/init/ModItems.java"
BLOCKS_JAVA = "src/main/java/com/ohno/ohnomod/init/ModBlocks.java"

# Базовая папка с ресурсами мода
RES_DIR = f"src/main/resources/assets/{MOD_ID}"
# =======================================================


def generate_item_json(name):
    return f"""{{
  "parent": "minecraft:item/generated",
  "textures": {{
    "layer0": "{MOD_ID}:items/{name}"
  }}
}}"""


def generate_blockstate_json(name):
    return f"""{{
  "variants": {{
    "normal": {{ "model": "{MOD_ID}:{name}" }}
  }}
}}"""


def generate_block_model_json(name):
    return f"""{{
  "parent": "minecraft:block/cube_all",
  "textures": {{
    "all": "{MOD_ID}:blocks/{name}"
  }}
}}"""


def generate_block_item_json(name):
    return f"""{{
  "parent": "{MOD_ID}:block/{name}"
}}"""


def process_items():
    if not os.path.exists(ITEMS_JAVA):
        print(f"[-] Файл предметов не найден: {ITEMS_JAVA} (пропускаем)")
        return 0

    output_dir = os.path.join(RES_DIR, "models", "item")
    os.makedirs(output_dir, exist_ok=True)

    pattern = re.compile(r'new\s+ItemBase\s*\(\s*"([^"]+)"\s*\)')
    count = 0

    with open(ITEMS_JAVA, "r", encoding="utf-8") as f:
        for line in f:
            match = pattern.search(line)
            if match:
                name = match.group(1)
                with open(
                    os.path.join(output_dir, f"{name}.json"),
                    "w",
                    encoding="utf-8",
                ) as jf:
                    jf.write(generate_item_json(name))
                count += 1
    return count


def process_blocks():
    if not os.path.exists(BLOCKS_JAVA):
        print(f"[-] Файл блоков не найден: {BLOCKS_JAVA} (пропускаем)")
        return 0

    # Папки для 3 видов JSON
    blockstates_dir = os.path.join(RES_DIR, "blockstates")
    block_models_dir = os.path.join(RES_DIR, "models", "block")
    item_models_dir = os.path.join(RES_DIR, "models", "item")

    os.makedirs(blockstates_dir, exist_ok=True)
    os.makedirs(block_models_dir, exist_ok=True)
    os.makedirs(item_models_dir, exist_ok=True)

    # Ищет инициализацию блоков вроде new BlockBase("lead_ore", ...)
    pattern = re.compile(r'new\s+BlockBase\s*\(\s*"([^"]+)"')
    count = 0

    with open(BLOCKS_JAVA, "r", encoding="utf-8") as f:
        for line in f:
            match = pattern.search(line)
            if match:
                name = match.group(1)

                # 1. Blockstate
                with open(
                    os.path.join(blockstates_dir, f"{name}.json"),
                    "w",
                    encoding="utf-8",
                ) as jf:
                    jf.write(generate_blockstate_json(name))

                # 2. Block Model
                with open(
                    os.path.join(block_models_dir, f"{name}.json"),
                    "w",
                    encoding="utf-8",
                ) as jf:
                    jf.write(generate_block_model_json(name))

                # 3. Item Model (для инвентаря)
                with open(
                    os.path.join(item_models_dir, f"{name}.json"),
                    "w",
                    encoding="utf-8",
                ) as jf:
                    jf.write(generate_block_item_json(name))

                count += 1
    return count


def main():
    print("[+] Запуск генерации ресурсов...")

    items_created = process_items()
    print(f"[+] Создано JSON-моделей предметов: {items_created}")

    blocks_created = process_blocks()
    print(
        f"[+] Создано JSON`ов для блоков: {blocks_created}"
    )


if __name__ == "__main__":
    main()