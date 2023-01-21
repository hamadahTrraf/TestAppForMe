package com.example.tms_app.DataBase.Dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tH\'J\u0010\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\'J\u0011\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000f\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J!\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006!"}, d2 = {"Lcom/example/tms_app/DataBase/Dao/MovieDao;", "", "deleteUserInfo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyTheTable", "getMovieDetails", "Lcom/example/tms_app/DataBase/MovieDetailsDb;", "getMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/tms_app/DataBase/Movie;", "getMoviesWithDetail", "getSessionId", "", "getUserName", "insertMovieDetails", "moviedetails", "(Lcom/example/tms_app/DataBase/MovieDetailsDb;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertSingleMovie", "movie", "(Lcom/example/tms_app/DataBase/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUserInfo", "user", "Lcom/example/tms_app/DataBase/UserInfo;", "(Lcom/example/tms_app/DataBase/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tesTPurpose", "updateFavouriteOfMovie", "isFavourite", "", "movie_id", "", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Movie")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Movie>> getMovies();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from MovieDetailsDb where record_id = (select max(record_id) from MovieDetailsDb) ")
    public abstract kotlinx.coroutines.flow.Flow<com.example.tms_app.DataBase.MovieDetailsDb> getMoviesWithDetail();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSingleMovie(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertMovieDetails(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.MovieDetailsDb moviedetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from MovieDetailsDb where record_id = (select max(record_id) from MovieDetailsDb)")
    public abstract java.lang.Object getMovieDetails(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.tms_app.DataBase.MovieDetailsDb> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from Movie")
    public abstract java.lang.Object emptyTheTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from UserInfo")
    public abstract java.lang.Object deleteUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertUserInfo(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.UserInfo user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select sessionId from UserInfo where record_id = (select max(record_id) from UserInfo)")
    public abstract java.lang.Object getSessionId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select * from Movie where isFavourite = 1")
    public abstract java.lang.Object tesTPurpose(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.tms_app.DataBase.Movie> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "update Movie set isFavourite = :isFavourite where id = :movie_id ")
    public abstract java.lang.Object updateFavouriteOfMovie(boolean isFavourite, int movie_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select userName from UserInfo where record_id = (select max(record_id) from UserInfo)")
    public abstract java.lang.Object getUserName(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}