import os
import re

# ================= НАСТРОЙКИ СТРУКТУРЫ =================
# Скрипт сам найдёт нужные папки относительно корня проекта
JAVA_FILE_PATH = "src/main/java/com/ohno/ohnomod/init/ModItems.java"
OUTPUT_DIR = "src/main/resources/assets/ohnomod/models/item"
MOD_ID = "ohnomod"
# =======================================================


def generate_item_json(item_name):
    """Возвращает шаблон JSON-модели предмета с ванильным родителем."""
    return f"""{{
  "parent": "minecraft:item/generated",
  "textures": {{
    "layer0": "{MOD_ID}:items/{item_name}"
  }}
}}"""


def main():
    # Проверяем, существует ли файл ModItems.java
    if not os.path.exists(JAVA_FILE_PATH):
        print(
            f"[-] Ошибка: Файл не найден по пути {JAVA_FILE_PATH}.\nПроверь, правильно ли запущен скрипт."
        )
        return

    # Создаём папку назначения, если её ещё нет
    os.makedirs(OUTPUT_DIR, exist_ok=True)

    # Регулярное выражение для поиска строк вида: new ItemBase("имя_предмета")
    # Ищет только то, что внутри кавычек
    pattern = re.compile(r'new\s+ItemBase\s*\(\s*"([^"]+)"\s*\)')

    count = 0

    print("[+] Чтение ModItems.java и генерация JSON-моделей...")

    with open(JAVA_FILE_PATH, "r", encoding="utf-8") as f:
        for line in f:
            match = pattern.search(line)
            if match:
                item_name = match.group(1)
                file_name = f"{item_name}.json"
                full_path = os.path.join(OUTPUT_DIR, file_name)

                # Генерируем контент
                json_content = generate_item_json(item_name)

                # Записываем файл
                with open(full_path, "w", encoding="utf-8") as json_file:
                    json_file.write(json_content)

                print(f" -> Создан: {file_name}")
                count += 1

    print(
        f"\n[+] Готово! Успешно создано моделей: {count} шт."
    )
    print(f"[+] Все файлы сохранены в: {OUTPUT_DIR}")


if __name__ == "__main__":
    main()