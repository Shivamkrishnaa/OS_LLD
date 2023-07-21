package SOLID_10_FACADE.helper;

import SOLID_10_FACADE.service.InventoryManagementService;

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
