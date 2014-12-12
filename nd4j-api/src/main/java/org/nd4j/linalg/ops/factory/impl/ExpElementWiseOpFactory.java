package org.nd4j.linalg.ops.factory.impl;

import org.nd4j.linalg.ops.ElementWiseOp;
import org.nd4j.linalg.ops.transforms.Exp;

/**
 * Created by agibsonccc on 12/11/14.
 */
public class ExpElementWiseOpFactory  extends BaseElementWiseOpFactory {
    private static ElementWiseOp INSTANCE = new Exp();
    @Override
    public ElementWiseOp create() {
        return INSTANCE;
    }
}
