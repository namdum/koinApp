package com.example.kionapp.di.module

import com.example.kionapp.data.repository.MainRepository
import org.koin.dsl.module

val repoModule = module {
    single {
        MainRepository(get())
    }
}