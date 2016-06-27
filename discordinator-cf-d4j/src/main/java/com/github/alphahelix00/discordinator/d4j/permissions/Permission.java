package com.github.alphahelix00.discordinator.d4j.permissions;

import sx.blah.discord.handle.obj.Permissions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created on:   6/25/2016
 * Author:       Kevin Xiao (github.com/alphahelix00)
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Permission {

    boolean requireMention() default PermissionDefaults.REQUIRE_MENTION;

    Permissions[] permissions() default {Permissions.SEND_MESSAGES, Permissions.READ_MESSAGES};

    boolean allowPrivateMessage() default PermissionDefaults.ALLOW_DM;

}