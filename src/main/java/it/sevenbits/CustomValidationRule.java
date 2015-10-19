package it.sevenbits;

import info.smart_tools.smartactors.core.FieldName;
import info.smart_tools.smartactors.core.IObject;
import info.smart_tools.smartactors.core.validation.IValidationRule;

public class CustomValidationRule implements IValidationRule {

    public CustomValidationRule(IObject conf) {

        System.out.println("Creating validation rule");

    }

    @Override
    public boolean validate(final IObject iObject) {
        return false;
    }

    @Override
    public String getMessage() {
        return null;
    }

//    @Override
    public FieldName getFieldName() {
        return null;
    }
}
