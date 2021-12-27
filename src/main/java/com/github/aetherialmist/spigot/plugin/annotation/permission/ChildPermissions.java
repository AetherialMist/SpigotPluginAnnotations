package com.github.aetherialmist.spigot.plugin.annotation.permission;


import java.lang.annotation.*;

/**
 * Container for repeatable {@link ChildPermission}.
 * <p>
 * Should NOT be used directly.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ChildPermissions {

    /**
     * The {@link ChildPermission}s appearing on the same {@link javax.lang.model.element.Element}
     *
     * @return The ChildPermissions
     */
    ChildPermission[] value() default {};

}
