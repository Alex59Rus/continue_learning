package org.example.homeworks;

import org.example.oop.Box;

public class HomeWorkIncrease extends Box {

        public Box increase(Box box,int countMultuply) {
            return new Box(this.length*countMultuply, this.width*countMultuply, this.height*countMultuply);
        }
}
