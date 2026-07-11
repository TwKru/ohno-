package com.ohno.ohnomod.blocks;

import com.ohno.ohnomod.ohno;
import com.ohno.ohnomod.tileentity.TileEntityWorkshop;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockWorkshop extends BlockBase {

    // Устанавливаем точные размеры: 2х3х2 (Ширина 2, Высота 3, Длина 2)
    protected static final AxisAlignedBB WORKSHOP_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 2.0D, 3.0D, 2.0D);

    public BlockWorkshop(String name, Material material) {
        super(name, material);
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return WORKSHOP_AABB;
    }

    @Override
    public AxisAlignedBB getSelectedBoundingBox(IBlockState state, World worldIn, BlockPos pos) {
        // Огромная черная рамка выделения под новые размеры
        return WORKSHOP_AABB.offset(pos);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.INVISIBLE;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean hasTileEntity(IBlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState state) {
        return new TileEntityWorkshop();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            TileEntityWorkshop tile = (TileEntityWorkshop) worldIn.getTileEntity(pos);
            if (tile != null) {
                playerIn.openGui(ohno.instance, 1, worldIn, pos.getX(), pos.getY(), pos.getZ());
            }
        }
        return true;
    }
}