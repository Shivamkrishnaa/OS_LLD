package Solid.SOLID_10_FACADE.helper;

import Solid.SOLID_10_FACADE.service.InventoryManagementService;

public class InventoryManagementHelper {
    private InventoryManagementService inventoryManagementService;
    public InventoryManagementHelper() {
        this.inventoryManagementService = new InventoryManagementService();
    }
    public void updateOrderPlace(){
        inventoryManagementService.checkInventory();
        inventoryManagementService.updateInventory();
        inventoryManagementService.checkItemLocation();
        inventoryManagementService.notifyWarehouse();
    }
}
