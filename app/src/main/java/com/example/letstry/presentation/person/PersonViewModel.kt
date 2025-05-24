package com.example.letstry.presentation.person

import android.net.Uri
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class PersonViewModel : ViewModel() {
    private val _state = MutableStateFlow(PersonState())
    val state: StateFlow<PersonState> = _state.asStateFlow()

    fun onCaptureButtonClicked() {
        // Implement camera capture logic
    }

    fun onImageCaptured(uri: Uri) {
        _state.value = _state.value.copy(
            capturedImageUri = uri,
            showCamera = false
        )
    }

    fun generate3DModels() {
        // Implement 3D model generation
    }
}

data class PersonState(
    val showCamera: Boolean = true,
    val capturedImageUri: Uri? = null,
    val isProcessing: Boolean = false,
    val models: List<String> = emptyList()
)

