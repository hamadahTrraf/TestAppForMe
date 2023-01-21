package com.example.tms_app.Application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001c"}, d2 = {"Lcom/example/tms_app/Application/tms_app;", "Landroid/app/Application;", "()V", "applicationScope", "Lkotlinx/coroutines/CoroutineScope;", "getApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;", "database", "Lcom/example/tms_app/DataBase/AppDatabase;", "getDatabase", "()Lcom/example/tms_app/DataBase/AppDatabase;", "database$delegate", "Lkotlin/Lazy;", "mainRepository", "Lcom/example/tms_app/Repositories/MainRepository;", "getMainRepository", "()Lcom/example/tms_app/Repositories/MainRepository;", "mainRepository$delegate", "searchRepository", "Lcom/example/tms_app/Repositories/SearchRepository;", "getSearchRepository", "()Lcom/example/tms_app/Repositories/SearchRepository;", "searchRepository$delegate", "tvRepository", "Lcom/example/tms_app/Repositories/TvRepository;", "getTvRepository", "()Lcom/example/tms_app/Repositories/TvRepository;", "tvRepository$delegate", "app_release"})
public final class tms_app extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope applicationScope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy database$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy tvRepository$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy searchRepository$delegate = null;
    
    public tms_app() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getApplicationScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.DataBase.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Repositories.MainRepository getMainRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Repositories.TvRepository getTvRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.Repositories.SearchRepository getSearchRepository() {
        return null;
    }
}