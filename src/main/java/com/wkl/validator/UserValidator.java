package com.wkl.validator;

import com.wkl.Model.UserModel;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by wklmogujie on 15/10/27.
 */
@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> zlass) {
        // 要验证的Model，为假则不验证。
        return UserModel.class.isAssignableFrom(zlass);
//        return false;
    }

    @Override
    public void validate(Object object, Errors errors) {
        UserModel userVO = (UserModel) object;
        ValidationUtils.rejectIfEmpty(errors, "Username", "user.name.required", "name的内容不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", "user.password.required", "password的内容不能为空");

        int length = userVO.getUsername().length();
        if (length > 20) {
            errors.rejectValue("Username", "user.name.too_long", "用户名不能超过{20}个字符");
        }
        length = userVO.getPassword().length();
        if (length < 6) {
            errors.rejectValue("password", "user.password.too_short", "密码太短，不能少于{6}个字符");
        } else if (length > 20) {
            errors.rejectValue("password", "user.password.too_long", "密码太长，不能长于{20}个字符");
        }
    }

}
