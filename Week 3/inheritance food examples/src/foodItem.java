import java.time.LocalDateTime;

    class FoodItem {
        private int itemId;
        private String itemName;
        public FoodItem(int itemId, String itemName) {
            this.itemId = itemId;
            this.itemName = itemName;
        }
        public int getItemId() {
            return itemId;
        }
        public String getItemName() {
            return itemName;
        }
    }

    class FreshFood extends FoodItem {
        private LocalDateTime bbe;
        private boolean eatRaw;
        private String storage;

        public FreshFood(int itemId, String itemName, LocalDateTime bbe, boolean eatRaw, String storage) {
            super(itemId, itemName);
            this.bbe = bbe;
            this.eatRaw = eatRaw;
            this.storage = storage;
        }

        public LocalDateTime getBBE() {
            return bbe;
        }
        public boolean isEatRaw() {
            return eatRaw;
        }
        public String getStorage() {
            return storage;
        }
    }

    class FrozenFood extends FoodItem {
        private LocalDateTime useBefore;
        private boolean eatRaw;
        private boolean mustDefrost;
        private int storage;

        public FrozenFood(int itemId, String itemName, LocalDateTime useBefore, boolean eatRaw, boolean mustDefrost, int storage) {
            super(itemId,itemName);
            this.useBefore = useBefore;
            this.eatRaw = eatRaw;
            this.mustDefrost = mustDefrost;
            this.storage = storage;
        }
        public LocalDateTime getUseBefore() {
            return useBefore;
        }
        public boolean getEatRaw() {
            return eatRaw;
        }
        public boolean getMustDefrost() {
            return mustDefrost;
        }
        public int getStorage() {
            return storage;
        }
    }

    class CannedFood extends FoodItem {
        private LocalDateTime useBefore;
        private boolean eatRaw;
    }