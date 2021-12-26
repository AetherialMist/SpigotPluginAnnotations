package aetherial.spigot.plugin.annotation.permission;

import java.lang.annotation.*;

/**
 * Container for repeatable {@link PermissionTag}.
 * <p>
 * Should NOT be used directly.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface PermissionsTag {

    PermissionTag[] value() default {};

}
