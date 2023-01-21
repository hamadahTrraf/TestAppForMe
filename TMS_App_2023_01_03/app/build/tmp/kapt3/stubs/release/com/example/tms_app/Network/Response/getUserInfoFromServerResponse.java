package com.example.tms_app.Network.Response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0007H\u00c6\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\t\u0010$\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/example/tms_app/Network/Response/getUserInfoFromServerResponse;", "", "avatar", "Lcom/example/tms_app/Network/Response/Avatar;", "id", "", "iso_639_1", "", "total_pages", "name", "include_adult", "", "username", "(Lcom/example/tms_app/Network/Response/Avatar;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAvatar", "()Lcom/example/tms_app/Network/Response/Avatar;", "getId", "()I", "getInclude_adult", "()Z", "getIso_639_1", "()Ljava/lang/String;", "getName", "getTotal_pages", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"})
public final class getUserInfoFromServerResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.Network.Response.Avatar avatar = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String iso_639_1 = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String total_pages = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final boolean include_adult = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String username = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Network.Response.getUserInfoFromServerResponse copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "avatar")
    com.example.tms_app.Network.Response.Avatar avatar, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "iso_639_1")
    java.lang.String iso_639_1, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "iso_3166_1")
    java.lang.String total_pages, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @com.squareup.moshi.Json(name = "include_adult")
    boolean include_adult, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "username")
    java.lang.String username) {
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
    
    public getUserInfoFromServerResponse(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "avatar")
    com.example.tms_app.Network.Response.Avatar avatar, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "iso_639_1")
    java.lang.String iso_639_1, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "iso_3166_1")
    java.lang.String total_pages, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @com.squareup.moshi.Json(name = "include_adult")
    boolean include_adult, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "username")
    java.lang.String username) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Network.Response.Avatar component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Network.Response.Avatar getAvatar() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIso_639_1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal_pages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getInclude_adult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
}