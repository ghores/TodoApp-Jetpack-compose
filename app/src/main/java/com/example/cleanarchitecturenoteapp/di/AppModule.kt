package com.example.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.example.cleanarchitecturenoteapp.data.local.NoteDatabase
import com.example.cleanarchitecturenoteapp.data.model.NoteUseCases
import com.example.cleanarchitecturenoteapp.data.repository.NoteRepository
import com.example.cleanarchitecturenoteapp.data.repository.NoteRepositoryImpl
import com.example.cleanarchitecturenoteapp.data.usecase.AddNote
import com.example.cleanarchitecturenoteapp.data.usecase.DeleteNote
import com.example.cleanarchitecturenoteapp.data.usecase.GetNote
import com.example.cleanarchitecturenoteapp.data.usecase.GetNotes
import com.example.cleanarchitecturenoteapp.utils.Constance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase = Room.databaseBuilder(
        app,
        NoteDatabase::class.java,
        Constance.DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository = NoteRepositoryImpl(db.noteDao)

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases = NoteUseCases(
        getNotes = GetNotes(repository),
        deleteNote = DeleteNote(repository),
        addNote = AddNote(repository),
        getNote = GetNote(repository)
    )
}