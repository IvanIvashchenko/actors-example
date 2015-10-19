package it.sevenbits;

import info.smart_tools.smartactors.core.IObject;
import info.smart_tools.smartactors.core.transformation.ITransformationRule;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CustomTransformationRule implements ITransformationRule {

    public CustomTransformationRule(IObject conf) {

        System.out.println("creating transformation rule");
    }

    @Override
    public void transform(final IObject iObject) {
        System.out.println("applying transformation rule");
    }
}
