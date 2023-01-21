package com.example.tms_app.Viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u001f\u001a\u00020\u0017J\u0016\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\fJ\u0011\u0010#\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\fJ\u0016\u0010\'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lcom/example/tms_app/Viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/tms_app/Repositories/MainRepository;", "(Lcom/example/tms_app/Repositories/MainRepository;)V", "_isLogged", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_movies", "", "Lcom/example/tms_app/DataBase/Movie;", "api_key", "", "getApi_key", "()Ljava/lang/String;", "isLogged", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "getMainRepository", "()Lcom/example/tms_app/Repositories/MainRepository;", "movies", "getMovies", "cleanCach", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyMoviesFromDatyaBase", "getTopRatedMovies", "pageNumber", "", "(Ljava/lang/Integer;)V", "insertMoviesIntoDataBase", "logOut", "login", "userName", "password", "search", "setFavouriteOff", "movie_id", "type", "setFavouriteOn", "app_release"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.Repositories.MainRepository mainRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.tms_app.DataBase.Movie>> _movies = null;
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLogged;
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
    public final java.lang.String getApi_key() {
        return null;
    }
    
    public final void getTopRatedMovies(@org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber) {
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
}