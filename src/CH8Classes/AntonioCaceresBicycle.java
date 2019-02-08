package CH8Classes;

public class AntonioCaceresBicycle {
        private double price;
        private String color;
        private boolean isPurchased;
        private String condition;
        private double psi;
        private int ageRange;
        private int wheels;
        private int numGears;
        private double rpm;
        private boolean isBraking;
        private boolean isInMotion;


        //constructor method

        public AntonioCaceresBicycle(double price, boolean isPurchased, String condition, int ageRange, String color) {
            this.price = price;
            this.isPurchased = isPurchased;
            this.condition = condition;
            this.ageRange = ageRange;
            this.color = color;
        }
        //overriding constructors based on specificity
    public AntonioCaceresBicycle(double price, boolean isPurchased, String condition, int ageRange, String color, int wheels, int numGears) {
        this.price = price;
        this.isPurchased = isPurchased;
        this.condition = condition;
        this.ageRange = ageRange;
        this.color = color;
        this.wheels = wheels;
        this.numGears = numGears;
    }

        //indicators
        public double getPrice() {
            return price;
        }

        public boolean isPurchased() {
            return isPurchased;
        }

        public String getCondition() {
            return condition;
        }

        public double getPsi() {
            return psi;
        }

        public int getWheels() {
            return wheels;
        }

        public int getNumGears() {
            return numGears;
        }

        public int getAgeRange() {
            return ageRange;
        }

        public String getColor() {
            return color;
        }

        public double getRPM() {
            return rpm;
        }

        public boolean isBraking() {
            return isBraking;
        }

        public boolean isInMotion() {
            return isInMotion;
        }
        //mutators
        public void setPrice(double price) {
            this.price = price;
        }
        public void setColor(String color) {
        this.color = color;
        }
        public void setPurchased(boolean purchased) {
            isPurchased = purchased;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public void setPsi(double psi) {
            this.psi = psi;
        }
        @Override
        public String toString(){
            return "This is a " + color + " bicycle that is in " + condition +
                    " condition. The age range for this bike is" + ageRange +
                    ". This bike sells for $" + price + ".";
        }
    }
