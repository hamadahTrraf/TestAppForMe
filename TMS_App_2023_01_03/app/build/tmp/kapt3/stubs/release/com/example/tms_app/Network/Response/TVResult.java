package com.example.tms_app.Network.Response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u00c6\u0003J\u009d\u0001\u00102\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0003\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00072\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u00020\u0007H\u00d6\u0001J\t\u00107\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001a\u00a8\u00068"}, d2 = {"Lcom/example/tms_app/Network/Response/TVResult;", "", "poster_path", "", "popularity", "", "id", "", "backdrop_path", "vote_average", "overview", "first_air_date", "origin_country", "", "genre_ids", "original_language", "vote_count", "name", "original_name", "(Ljava/lang/String;FILjava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getBackdrop_path", "()Ljava/lang/String;", "getFirst_air_date", "getGenre_ids", "()Ljava/util/List;", "getId", "()I", "getName", "getOrigin_country", "getOriginal_language", "getOriginal_name", "getOverview", "getPopularity", "()F", "getPoster_path", "getVote_average", "getVote_count", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class TVResult {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String poster_path = null;
    private final float popularity = 0.0F;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backdrop_path = null;
    private final float vote_average = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String first_air_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> origin_country = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> genre_ids = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String original_language = null;
    private final int vote_count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String original_name = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Network.Response.TVResult copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String poster_path, @com.squareup.moshi.Json(name = "popularity")
    float popularity, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdrop_path, @com.squareup.moshi.Json(name = "vote_average")
    float vote_average, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "first_air_date")
    java.lang.String first_air_date, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "origin_country")
    java.util.List<java.lang.String> origin_country, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "genre_ids")
    java.util.List<java.lang.String> genre_ids, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String original_language, @com.squareup.moshi.Json(name = "vote_count")
    int vote_count, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_name")
    java.lang.String original_name) {
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
    
    public TVResult(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String poster_path, @com.squareup.moshi.Json(name = "popularity")
    float popularity, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdrop_path, @com.squareup.moshi.Json(name = "vote_average")
    float vote_average, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "first_air_date")
    java.lang.String first_air_date, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "origin_country")
    java.util.List<java.lang.String> origin_country, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "genre_ids")
    java.util.List<java.lang.String> genre_ids, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String original_language, @com.squareup.moshi.Json(name = "vote_count")
    int vote_count, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_name")
    java.lang.String original_name) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPoster_path() {
        return null;
    }
    
    public final float component2() {
        return 0.0F;
    }
    
    public final float getPopularity() {
        return 0.0F;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    public final float component5() {
        return 0.0F;
    }
    
    public final float getVote_average() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_air_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getOrigin_country() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getGenre_ids() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_name() {
        return null;
    }
}