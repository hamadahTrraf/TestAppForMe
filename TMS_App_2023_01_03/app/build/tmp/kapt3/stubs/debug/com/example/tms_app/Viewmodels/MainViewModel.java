package com.example.tms_app.Viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010\u001d\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0011\u0010\"\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0015\u0010#\u001a\u00020\u001b2\b\u0010$\u001a\u0004\u0018\u00010 \u00a2\u0006\u0002\u0010%J\u0011\u0010&\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0011\u0010\'\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010(\u001a\u00020\u001bJ\u0016\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012J\u0019\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0011\u0010/\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0016\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0012J\u0016\u00103\u001a\u00020\u001b2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u0012R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/example/tms_app/Viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/tms_app/Repositories/MainRepository;", "(Lcom/example/tms_app/Repositories/MainRepository;)V", "MovieWithDetail", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/tms_app/DataBase/MovieDetailsDb;", "getMovieWithDetail", "()Lkotlinx/coroutines/flow/StateFlow;", "_MovieWithDetail", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isLogged", "", "_movies", "", "Lcom/example/tms_app/DataBase/Movie;", "api_key", "", "getApi_key", "()Ljava/lang/String;", "isLogged", "getMainRepository", "()Lcom/example/tms_app/Repositories/MainRepository;", "movies", "getMovies", "cleanCach", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyMoviesFromDatyaBase", "getMovieDetailsByNetwork", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetailsFromDb", "getTopRatedMovies", "pageNumber", "(Ljava/lang/Integer;)V", "getUserName", "insertMoviesIntoDataBase", "logOut", "login", "userName", "password", "saveMovieDetailsInDb", "movieDetailsDb", "(Lcom/example/tms_app/DataBase/MovieDetailsDb;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "setFavouriteOff", "movie_id", "type", "setFavouriteOn", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.Repositories.MainRepository mainRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.tms_app.DataBase.Movie>> _movies = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLogged;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.tms_app.DataBase.MovieDetailsDb> _MovieWithDetail = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String api_key = "9c0412867f5e586e1eb9d1ae58f4f89d";
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.Repositories.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Repositories.MainRepository getMainRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.tms_app.DataBase.Movie>> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLogged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.tms_app.DataBase.MovieDetailsDb> getMovieWithDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApi_key() {
        return null;
    }
    
    public final void getTopRatedMovies(@org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserName(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    public final void setFavouriteOn(int movie_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void setFavouriteOff(int movie_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertMoviesIntoDataBase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object emptyMoviesFromDatyaBase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object cleanCach(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object search(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public final void logOut() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieDetailsByNetwork(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMovieDetailsFromDb(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.tms_app.DataBase.MovieDetailsDb> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveMovieDetailsInDb(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.MovieDetailsDb movieDetailsDb, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}