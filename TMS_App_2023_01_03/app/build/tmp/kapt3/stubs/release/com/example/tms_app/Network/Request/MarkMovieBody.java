package com.example.tms_app.Network.Request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/tms_app/Network/Request/MarkMovieBody;", "", "media_type", "", "media_id", "", "favorite", "", "(Ljava/lang/String;IZ)V", "getFavorite", "()Z", "getMedia_id", "()I", "getMedia_type", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class MarkMovieBody {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String media_type = null;
    private final int media_id = 0;
    private final boolean favorite = false;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Network.Request.MarkMovieBody copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "media_type")
    java.lang.String media_type, @com.squareup.moshi.Json(name = "media_id")
    int media_id, @com.squareup.moshi.Json(name = "favorite")
    boolean favorite) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MarkMovieBody(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "media_type")
    java.lang.String media_type, @com.squareup.moshi.Json(name = "media_id")
    int media_id, @com.squareup.moshi.Json(name = "favorite")
    boolean favorite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMedia_type() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getMedia_id() {
        return 0;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getFavorite() {
        return false;
    }
}