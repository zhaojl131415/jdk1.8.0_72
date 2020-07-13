/*
 * Copyright (c) 2003, 2004, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.lang.annotation;

/**
 * Annotation retention policy.  The constants of this enumerated type
 * describe the various policies for retaining annotations.  They are used
 * in conjunction with the {@link Retention} meta-annotation type to specify
 * how long annotations are to be retained.
 *
 * @author  Joshua Bloch
 * @since 1.5
 *
 * 有效范围: RUNTIME > CLASS > SOURCE, 即RUNTIME有效范围最大, 包含 CLASS 和 SOURCE
 */
public enum RetentionPolicy {
    /**
     * Annotations are to be discarded by the compiler.
     *
     * 只在源码时有效, 使用场景: {@link Override} {@link SuppressWarnings}
     */
    SOURCE,

    /**
     * Annotations are to be recorded in the class file by the compiler
     * but need not be retained by the VM at run time.  This is the default
     * behavior.
     *
     * 源码时和编译成class后有效, 没见哪用过
     */
    CLASS,

    /**
     * Annotations are to be recorded in the class file by the compiler and
     * retained by the VM at run time, so they may be read reflectively.
     *
     * @see java.lang.reflect.AnnotatedElement
     *
     * 源码时和编译成class后, 且运行时都有效, 一般我们自定义注解都使用这个, 使用场景: {@link Deprecated}
     */
    RUNTIME
}
