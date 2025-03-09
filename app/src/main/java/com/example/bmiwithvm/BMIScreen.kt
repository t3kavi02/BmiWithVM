package com.example.bmiwithvm

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun BMIScreen(viewModel: BMIViewModel = viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp, top = 48.dp),
        verticalArrangement = Arrangement.Top,
    ) {
        Text(
            text = "BMI Calculator",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 24.dp),
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = viewModel.height,
            onValueChange = viewModel::updateHeight,
            label = { Text("Height") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 12.dp,
                    bottom = 12.dp)
        )

        OutlinedTextField(
            value = viewModel.weight,
            onValueChange = viewModel::updateWeight,
            label = { Text("Weight") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal),
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 12.dp)
        )

        Text(
            text = "Your BMI is ${viewModel.bmi}",
            modifier = Modifier
                .padding(top = 12.dp,
                    start = 12.dp)
        )
    }
}