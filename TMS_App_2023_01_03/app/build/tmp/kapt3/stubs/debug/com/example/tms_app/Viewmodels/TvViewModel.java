package com.example.tms_app.Viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\nJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\nR\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/example/tms_app/Viewmodels/TvViewModel;", "Landroidx/lifecycle/ViewModel;", "tvRepository", "Lcom/example/tms_app/Repositories/TvRepository;", "(Lcom/example/tms_app/Repositories/TvRepository;)V", "_tv", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/tms_app/DataBase/Entities/Tv;", "api_key", "", "getApi_key", "()Ljava/lang/String;", "tv", "Lkotlinx/coroutines/flow/StateFlow;", "getTv", "()Lkotlinx/coroutines/flow/StateFlow;", "getTvRepository", "()Lcom/example/tms_app/Repositories/TvRepository;", "emptyTvsFromDatyaBase", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopRatedTv", "pageNumber", "", "(Ljava/lang/Integer;)V", "insertTvsIntoDataBase", "setFavouriteOff", "tv_id", "type", "setFavouriteOn", "app_debug"})
public final class TvViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.Repositories.TvRepository tvRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.tms_app.DataBase.Entities.Tv>> _tv = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String api_key = "9c0412867f5e586e1eb9d1ae58f4f89d";
    
    public TvViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.Repositories.TvRepository tvRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Repositories.TvRepository getTvRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.example.tms_app.DataBase.Entities.Tv>> getTv() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApi_key() {
        return null;
    }
    
    public final void getTopRatedTv(@org.jetbrains.annotations.Nullable()
    java.lang.Integer pageNumber) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTvsIntoDataBase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object emptyTvsFromDatyaBase(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void setFavouriteOn(int tv_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    public final void setFavouriteOff(int tv_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
}