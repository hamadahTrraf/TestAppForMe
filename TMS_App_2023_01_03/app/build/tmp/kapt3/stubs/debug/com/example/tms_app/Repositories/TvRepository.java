package com.example.tms_app.Repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJB\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0086@\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ1\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J1\u0010%\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006&"}, d2 = {"Lcom/example/tms_app/Repositories/TvRepository;", "", "tvDao", "Lcom/example/tms_app/DataBase/Dao/TvDao;", "(Lcom/example/tms_app/DataBase/Dao/TvDao;)V", "getTvDao", "()Lcom/example/tms_app/DataBase/Dao/TvDao;", "tvs", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/tms_app/DataBase/Entities/Tv;", "getTvs", "()Lkotlinx/coroutines/flow/Flow;", "emptyTheTable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "", "getTopRatedTvs", "Lkotlin/Result;", "Lcom/example/tms_app/Network/Response/GetTopRatedTVResponse;", "apiKey", "language", "page", "", "getTopRatedTvs-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTvsAndFlagThem", "session_id", "pageMovie", "insertTvIntoDataBase", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavouriteOff", "tv_id", "api_key", "type", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setFavouriteOn", "app_debug"})
public final class TvRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.DataBase.Dao.TvDao tvDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Entities.Tv>> tvs = null;
    
    public TvRepository(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.Dao.TvDao tvDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.DataBase.Dao.TvDao getTvDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Entities.Tv>> getTvs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertTvIntoDataBase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tms_app.DataBase.Entities.Tv> tvs, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTvsAndFlagThem(@org.jetbrains.annotations.NotNull()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    java.lang.String session_id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer pageMovie, @org.jetbrains.annotations.NotNull()
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
    public final java.lang.Object setFavouriteOff(int tv_id, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String session_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setFavouriteOn(int tv_id, @org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String session_id, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}