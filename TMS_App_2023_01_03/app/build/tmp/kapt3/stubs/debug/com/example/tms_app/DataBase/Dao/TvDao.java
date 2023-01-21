package com.example.tms_app.DataBase.Dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/tms_app/DataBase/Dao/TvDao;", "", "emptyTheTable", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyUserInfo", "getSessionId", "", "getTv", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/tms_app/DataBase/Entities/Tv;", "insertSingleTv", "tv", "(Lcom/example/tms_app/DataBase/Entities/Tv;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavouriteOfTv", "isFavourite", "", "tv_id", "", "(ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface TvDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from Tv")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.tms_app.DataBase.Entities.Tv>> getTv();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertSingleTv(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.Entities.Tv tv, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from Tv")
    public abstract java.lang.Object emptyTheTable(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "delete from Tv")
    public abstract java.lang.Object emptyUserInfo(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "select sessionId from UserInfo where record_id = (select max(record_id) from UserInfo)")
    public abstract java.lang.Object getSessionId(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "update Tv set isFavourite = :isFavourite where id = :tv_id ")
    public abstract java.lang.Object updateFavouriteOfTv(boolean isFavourite, int tv_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}