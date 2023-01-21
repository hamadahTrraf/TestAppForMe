package com.example.tms_app.Repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J2\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0011\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J2\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b!\u0010\"J-\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\n\b\u0002\u0010&\u001a\u0004\u0018\u00010 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0011\u0010(\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012JN\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010$\u001a\u00020\u00172\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010,\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0017H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b.\u0010/J2\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u0010\u001aJ\u0011\u00103\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u00104\u001a\u00020\u00112\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0019\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u000208H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J*\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u00112\u0006\u0010?\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@J1\u0010A\u001a\u00020\u00112\u0006\u0010B\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJ1\u0010E\u001a\u00020\u00112\u0006\u0010B\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010DJB\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00142\u0006\u0010$\u001a\u00020\u00172\u0006\u0010H\u001a\u00020\u00172\u0006\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\bK\u0010LR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006M"}, d2 = {"Lcom/example/tms_app/Repositories/MainRepository;", "", "movieDao", "Lcom/example/tms_app/DataBase/Dao/MovieDao;", "(Lcom/example/tms_app/DataBase/Dao/MovieDao;)V", "MovieWithDetail", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/tms_app/DataBase/MovieDetailsDb;", "getMovieWithDetail", "()Lkotlinx/coroutines/flow/Flow;", "getMovieDao", "()Lcom/example/tms_app/DataBase/Dao/MovieDao;", "movies", "", "Lcom/example/tms_app/DataBase/Movie;", "getMovies", "clearUserInfo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSessionKey", "Lkotlin/Result;", "Lcom/example/tms_app/Network/Response/CreateSessionIdResponse;", "api_key", "", "approvedRequestToken", "createSessionKey-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyTheTable", "getMovieDetailsFromDb", "getMovieDetailsFromNetwork", "Lcom/example/tms_app/Network/Response/MovieDetails;", "movieId", "", "getMovieDetailsFromNetwork-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMoviesAndFlagThem", "apiKey", "session_id", "pageMovie", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "getTopRatedMovies", "Lcom/example/watchme/Network/GetMoviesResponse;", "language", "page", "region", "getTopRatedMovies-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfoFromServer", "Lcom/example/tms_app/Network/Response/getUserInfoFromServerResponse;", "getUserInfoFromServer-0E7RQCE", "getUserName", "insertMoviesIntoDataBase", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUserInfo", "user", "Lcom/example/tms_app/DataBase/UserInfo;", "(Lcom/example/tms_app/DataBase/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestUnApprovalRToken", "Lcom/example/tms_app/Network/Response/GetUnApprovalRequestToken;", "requestUnApprovalRToken-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMovieDetails", "movieDetails", "(Lcom/example/tms_app/DataBase/MovieDetailsDb;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavouriteOff", "movie_id", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavouriteOn", "validateRequestTokenWithLogin", "Lcom/example/tms_app/Network/Response/ValidateRTokenLoginResponse;", "userName", "password", "unUprovalRToken", "validateRequestTokenWithLogin-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.DataBase.Dao.MovieDao movieDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Movie>> movies = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.example.tms_app.DataBase.MovieDetailsDb> MovieWithDetail = null;
    
    public MainRepository(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.Dao.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.DataBase.Dao.MovieDao getMovieDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Movie>> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.example.tms_app.DataBase.MovieDetailsDb> getMovieWithDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMoviesIntoDataBase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tms_app.DataBase.Movie> movies, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSessionId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object emptyTheTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertUserInfo(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.UserInfo user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMoviesAndFlagThem(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String session_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageMovie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setFavouriteOff(int movie_id, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String session_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setFavouriteOn(int movie_id, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String session_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserName(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveMovieDetails(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.MovieDetailsDb movieDetails, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieDetailsFromDb(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.tms_app.DataBase.MovieDetailsDb> continuation) {
        return null;
    }
}