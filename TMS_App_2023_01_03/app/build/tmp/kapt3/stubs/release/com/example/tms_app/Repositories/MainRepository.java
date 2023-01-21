package com.example.tms_app.Repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0011\u0010\u001f\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJN\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00112\u0006\u0010\u001a\u001a\u00020\u00142\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b%\u0010&J2\u0010\'\u001a\b\u0012\u0004\u0012\u00020(0\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010\u0017J!\u0010*\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020.H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J*\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b2\u00103J1\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J1\u00108\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u00106\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107JB\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00112\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u00142\u0006\u0010=\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b>\u0010?R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006@"}, d2 = {"Lcom/example/tms_app/Repositories/MainRepository;", "", "movieDao", "Lcom/example/tms_app/DataBase/Dao/MovieDao;", "(Lcom/example/tms_app/DataBase/Dao/MovieDao;)V", "getMovieDao", "()Lcom/example/tms_app/DataBase/Dao/MovieDao;", "movies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/tms_app/DataBase/Movie;", "getMovies", "()Lkotlinx/coroutines/flow/Flow;", "clearUserInfo", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSessionKey", "Lkotlin/Result;", "Lcom/example/tms_app/Network/Response/CreateSessionIdResponse;", "api_key", "", "approvedRequestToken", "createSessionKey-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyTheTable", "getMoviesAndFlagThem", "apiKey", "session_id", "pageMovie", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "getTopRatedMovies", "Lcom/example/watchme/Network/GetMoviesResponse;", "language", "page", "region", "getTopRatedMovies-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserInfoFromServer", "Lcom/example/tms_app/Network/Response/getUserInfoFromServerResponse;", "getUserInfoFromServer-0E7RQCE", "insertMoviesIntoDataBase", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUserInfo", "user", "Lcom/example/tms_app/DataBase/UserInfo;", "(Lcom/example/tms_app/DataBase/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestUnApprovalRToken", "Lcom/example/tms_app/Network/Response/GetUnApprovalRequestToken;", "requestUnApprovalRToken-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavouriteOff", "movie_id", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavouriteOn", "validateRequestTokenWithLogin", "Lcom/example/tms_app/Network/Response/ValidateRTokenLoginResponse;", "userName", "password", "unUprovalRToken", "validateRequestTokenWithLogin-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.DataBase.Dao.MovieDao movieDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Movie>> movies = null;
    
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
}