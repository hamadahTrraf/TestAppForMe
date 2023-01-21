package com.example.watchme.Network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0011H\u00c6\u0003J\t\u0010.\u001a\u00020\nH\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\t\u00100\u001a\u00020\u0011H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000f\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u00a6\u0001\u00109\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\u000e\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00112\b\b\u0003\u0010\u0012\u001a\u00020\n2\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0014\u001a\u00020\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010=\u001a\u00020\nH\u00d6\u0001J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u0012\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d\u00a8\u0006?"}, d2 = {"Lcom/example/watchme/Network/Result;", "", "poster_path", "", "adult", "", "overview", "release_date", "genre_ids", "", "", "id", "original_title", "original_language", "title", "backdrop_path", "popularity", "", "vote_count", "video", "vote_average", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/Boolean;F)V", "getAdult", "()Z", "getBackdrop_path", "()Ljava/lang/String;", "getGenre_ids", "()Ljava/util/List;", "getId", "()I", "getOriginal_language", "getOriginal_title", "getOverview", "getPopularity", "()F", "getPoster_path", "getRelease_date", "getTitle", "getVideo", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getVote_average", "getVote_count", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FILjava/lang/Boolean;F)Lcom/example/watchme/Network/Result;", "equals", "other", "hashCode", "toString", "app_debug"})
@com.squareup.moshi.JsonClass(generateAdapter = true)
public final class Result {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String poster_path = null;
    private final boolean adult = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String overview = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String release_date = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Integer> genre_ids = null;
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String original_title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String original_language = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String backdrop_path = null;
    private final float popularity = 0.0F;
    private final int vote_count = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean video = null;
    private final float vote_average = 0.0F;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.watchme.Network.Result copy(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String poster_path, @com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String release_date, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "genre_ids")
    java.util.List<java.lang.Integer> genre_ids, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdrop_path, @com.squareup.moshi.Json(name = "popularity")
    float popularity, @com.squareup.moshi.Json(name = "vote_count")
    int vote_count, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video")
    java.lang.Boolean video, @com.squareup.moshi.Json(name = "vote_average")
    float vote_average) {
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
    
    public Result(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "poster_path")
    java.lang.String poster_path, @com.squareup.moshi.Json(name = "adult")
    boolean adult, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "overview")
    java.lang.String overview, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "release_date")
    java.lang.String release_date, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "genre_ids")
    java.util.List<java.lang.Integer> genre_ids, @com.squareup.moshi.Json(name = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_title")
    java.lang.String original_title, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "original_language")
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "title")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "backdrop_path")
    java.lang.String backdrop_path, @com.squareup.moshi.Json(name = "popularity")
    float popularity, @com.squareup.moshi.Json(name = "vote_count")
    int vote_count, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "video")
    java.lang.Boolean video, @com.squareup.moshi.Json(name = "vote_average")
    float vote_average) {
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
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getAdult() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRelease_date() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getGenre_ids() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBackdrop_path() {
        return null;
    }
    
    public final float component11() {
        return 0.0F;
    }
    
    public final float getPopularity() {
        return 0.0F;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getVote_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getVideo() {
        return null;
    }
    
    public final float component14() {
        return 0.0F;
    }
    
    public final float getVote_average() {
        return 0.0F;
    }
}