package Builder;

/**
 * Class representing a Kitchen
 *
 * @author Adam Debczak
 */
public class Kitchen {
    private int cupboards;
    private int chairs;
    private String table;
    private String oven;
    private String sink;

    private boolean microwave;
    private boolean dishwasher;

    /**
     * Private constructor of Kitchen class
     *
     * @param kitchenBuilder Builder for creating a kitchen object
     */
    private Kitchen(KitchenBuilder kitchenBuilder) {
        this.chairs = kitchenBuilder.getChairs();
        this.cupboards = kitchenBuilder.getCupboards();
        this.table = kitchenBuilder.getTable();
        this.oven = kitchenBuilder.getOven();
        this.sink = kitchenBuilder.getSink();
        this.microwave = kitchenBuilder.hasMicrowave();
        this.dishwasher = kitchenBuilder.hasDishwasher();
    }

    /**
     * Overridden toString method for easy printing
     *
     * @return String representing a kitchen
     */
    @Override
    public String toString() {
        String result = "";
        if (cupboards > 0)
            result += "Cupboards: " + cupboards + "\n";

        if (chairs > 0)
            result += "Chairs: " + chairs + "\n";

        if (!table.equals(null))
            result += "Table: " + table + "\n";

        if (!oven.equals(null))
            result += "Oven: " + oven + "\n";

        if (!sink.equals(null))
            result += "Sink: " + sink + "\n";

        result += "Optional: ";
        if (!microwave && !dishwasher)
            result += "None\n";

        if (microwave)
            result += "Microwave\n";
        if (dishwasher)
            result += "Dishwasher\n";

        return result;
    }

    /**
     * Check whether kitchen has an optional microwave installed
     *
     * @return Whether kitchen has an optional microwave installed
     */
    public boolean hasMicrowave() {
        return microwave;
    }

    /**
     * Check whether kitchen has an optional dishwasher installed
     *
     * @return Whether kitchen has an optional dishwasher installed
     */
    public boolean hasDishwasher() {
        return dishwasher;
    }

    /**
     * Get the amount of cupboards
     *
     * @return Amount of cupboards
     */
    public int getCupboards() {
        return cupboards;
    }

    /**
     * Get the amount of chairs
     *
     * @return Amount of chairs
     */
    public int getChairs() {
        return chairs;
    }

    /**
     * Static inner class KitchenBuilder
     * Responsible for kitchen assembly
     *
     * @author Adam Debczak
     */
    public static class KitchenBuilder {
        private int cupboards;
        private int chairs;
        private String table;
        private String oven;
        private String sink;

        private boolean microwave;
        private boolean dishwasher;

        /**
         * Class Constructor
         *
         * @param cupboards Amount of cupboards mounted in a kitchen
         * @param chairs    Amount of chairs placed in a kitchen
         * @param table     Description of a table
         * @param oven      Description of an oven
         * @param sink      Description of a sink
         */
        public KitchenBuilder(int cupboards, int chairs, String table, String oven, String sink) {
            this.cupboards = cupboards;
            this.chairs = chairs;
            this.table = table;
            this.oven = oven;
            this.sink = sink;
        }

        /**
         * Get the amount of cupboards
         *
         * @return Amount of cupboards
         */
        public int getCupboards() {
            return cupboards;
        }

        /**
         * Get the amount of chairs
         *
         * @return Amount of chairs
         */
        public int getChairs() {
            return chairs;
        }

        /**
         * Get the description of the table
         *
         * @return the description of the table
         */
        public String getTable() {
            return table;
        }

        /**
         * Get the description of the oven
         *
         * @return the description of the oven
         */
        public String getOven() {
            return oven;
        }

        /**
         * Get the description of the sink
         *
         * @return the description of the sink
         */
        public String getSink() {
            return sink;
        }

        /**
         * Check whether kitchen has an optional microwave installed
         *
         * @return Whether kitchen has an optional microwave installed
         */
        public boolean hasMicrowave() {
            return microwave;
        }

        /**
         * Check whether kitchen has an optional dishwasher installed
         *
         * @return Whether kitchen has an optional dishwasher installed
         */
        public boolean hasDishwasher() {
            return dishwasher;
        }


        /**
         * Set the optional parameter to mount in a kitchen
         *
         * @param microwave Optional parameter to mount in a kitchen
         */
        public KitchenBuilder setMicrowave(boolean microwave) {
            this.microwave = microwave;
            return this;
        }

        /**
         * Set the optional parameter to mount in a kitchen
         *
         * @param dishwasher Optional parameter to mount in a kitchen
         */
        public KitchenBuilder setDishwasher(boolean dishwasher) {
            this.dishwasher = dishwasher;
            return this;
        }


        /**
         * Build kitchen with the current parameters
         *
         * @return An instance of a built kitchen
         */
        public Kitchen build() {
            return new Kitchen(this);
        }
    }
}




