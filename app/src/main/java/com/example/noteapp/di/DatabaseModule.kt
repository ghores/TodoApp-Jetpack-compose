package com.example.noteapp.di

import android.content.Context
import androidx.room.Room
import com.example.noteapp.data.local.NoteDatabase
import com.example.noteapp.data.model.NoteUseCases
import com.example.noteapp.data.repository.NoteRepository
import com.example.noteapp.data.repository.NoteRepositoryImpl
import com.example.noteapp.data.usecase.AddNote
import com.example.noteapp.data.usecase.DeleteNote
import com.example.noteapp.data.usecase.GetNote
import com.example.noteapp.data.usecase.GetNotes
import com.example.noteapp.utils.Constance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(@ApplicationContext context: Context): NoteDatabase =
        Room.databaseBuilder(
            context,
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