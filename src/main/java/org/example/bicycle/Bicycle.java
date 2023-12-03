package org.example.bicycle;

import java.util.Random;

/**
 * Class provided bicycle
 */
public class Bicycle {
    Random rnd = new Random();

    /**
     * Inner class provided handlebar of bicycle
     */
    public class Handlebar implements Damageble {
        private int durability;

        /** Constructor provided durability of handlebar
         *
         * @param durability of handlebar
         */
        public Handlebar(int durability) {
            this.durability = durability;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        public int getDurability() {
            return durability;
        }

        @Override
        public void getDamage() {
            this.setDurability(this.getDurability() - rnd.nextInt(0, 11));
        }
    }
    /**
     * Inner class provided saddle of bicycle
     */
    public class Saddle implements Damageble {
        private int durability;
        /** Constructor provided durability of saddle
         *
         * @param durability of saddle
         */
        public Saddle(int durability) {
            this.durability = durability;
        }

        public int getDurability() {
            return durability;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        @Override
        public void getDamage() {
            this.setDurability(this.getDurability() - rnd.nextInt(0, 11));
        }
    }
    /**
     * Inner class provided wheel of bicycle
     */
    public class Wheel implements Damageble {
        private int durability;
        /** Constructor provided durability of wheel
         *
         * @param durability of wheel
         */
        public Wheel(int durability) {
            this.durability = durability;
        }

        public int getDurability() {
            return durability;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        @Override
        public void getDamage() {
            this.setDurability(this.getDurability() - rnd.nextInt(0, 11));
        }

    }
    /**
     * Inner class provided gears of bicycle
     */
    public class Gears implements Damageble {
        private int durability;
        /** Constructor provided durability of gears
         *
         * @param durability of gears
         */
        public Gears(int durability) {
            this.durability = durability;
        }

        public int getDurability() {
            return durability;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        @Override
        public void getDamage() {
            this.setDurability(this.getDurability() - rnd.nextInt(0, 11));
        }

    }
    /**
     * Inner class provided frame of bicycle
     */
    public class Frame implements Damageble {
        private int durability;
        /** Constructor provided durability of frame
         *
         * @param durability of frame
         */
        public Frame(int durability) {
            this.durability = durability;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        public int getDurability() {
            return durability;
        }

        @Override
        public void getDamage() {
            this.setDurability(this.getDurability() - rnd.nextInt(0, 11));
        }
    }


}
