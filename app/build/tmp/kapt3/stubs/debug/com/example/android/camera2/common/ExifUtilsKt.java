package com.example.android.camera2.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"TAG", "", "computeExifOrientation", "", "rotationDegrees", "mirrored", "", "decodeExifOrientation", "Landroid/graphics/Matrix;", "exifOrientation", "app_debug"})
public final class ExifUtilsKt {
    private static final java.lang.String TAG = "ExifUtils";
    
    /**
     * Transforms rotation and mirroring information into one of the [ExifInterface] constants
     */
    public static final int computeExifOrientation(int rotationDegrees, boolean mirrored) {
        return 0;
    }
    
    /**
     * Helper function used to convert an EXIF orientation enum into a transformation matrix
     * that can be applied to a bitmap.
     *
     * @return matrix - Transformation required to properly display [Bitmap]
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Matrix decodeExifOrientation(int exifOrientation) {
        return null;
    }
}