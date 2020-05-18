package com.javalesson.lambdas;

import java.util.function.Consumer;

public class LambdaScopeTest {

    public static void main(String[] args) {
        LambdaScopeTest scopeTest = new LambdaScopeTest();
        LambdaScopeTest.LambdaScopeInner inner = scopeTest.new LambdaScopeInner();
        inner.testScope(999.00);
    }

    double d = 0.123;

    class LambdaScopeInner{
        double d = 456.123;

        void testScope(double d){

            Consumer<Double> res = e->{
                System.out.println("d = "+d);
                System.out.println("e = "+e);
                System.out.println("this.d ="+this.d);
                System.out.println("LambdaScopeTest.this.d ="+LambdaScopeTest.this.d);
            };

            res.accept(789.00);
        }
    }
}
