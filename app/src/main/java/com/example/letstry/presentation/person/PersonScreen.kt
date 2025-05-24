// PersonScreen.kt
package com.example.letstry.presentation.person

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun PersonScreen(viewModel: PersonViewModel = viewModel()) {
    val state by viewModel.state.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        if (state.showCamera) {
            CameraView(
                onImageCaptured = viewModel::onImageCaptured,
                modifier = Modifier.fillMaxSize()
            )
        } else if (state.capturedImageUri != null) {
            // Show captured image and 3D model generation UI
        }

        Button(onClick = viewModel::onCaptureButtonClicked) {
            Text("Take Photo")
        }
    }
}