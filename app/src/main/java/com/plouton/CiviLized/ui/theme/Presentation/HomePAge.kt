package com.plouton.CiviLized.ui.theme.Presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

data class Complaint(
    val id: String,
    val studentName: String,
    val date: String,
    val title: String,
    val description: String,
    val category: String,
    val status: String,
    val imageUrl: String,
    val profileImageUrl: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    var selectedTab by remember { mutableStateOf(1) }
    val sampleComplaints = listOf(
        Complaint(
            id = "1",
            studentName = "Ahmad Ali",
            date = "2024-01-15",
            title = "Broken Street Light",
            description = "The street light on Main Road has been broken for 3 days. It's causing safety issues during night time.",
            category = "Lightning",
            status = "In Progress",
            imageUrl = "/placeholder.svg?height=60&width=60",
            profileImageUrl = "/placeholder.svg?height=40&width=40"
        ),
        Complaint(
            id = "2",
            studentName = "Fatima Khan",
            date = "2024-01-14",
            title = "Water Supply Issue",
            description = "No water supply in Block A for the past 2 days. Students are facing difficulties.",
            category = "Water Supply",
            status = "Pending",
            imageUrl = "/placeholder.svg?height=60&width=60",
            profileImageUrl = "/placeholder.svg?height=40&width=40"
        ),
        Complaint(
            id = "3",
            studentName = "Hassan Ahmed",
            date = "2024-01-13",
            title = "Road Obstruction",
            description = "Large pothole on the campus road near library. It's damaging vehicles and causing traffic issues.",
            category = "Roads",
            status = "Resolved",
            imageUrl = "/placeholder.svg?height=60&width=60",
            profileImageUrl = "/placeholder.svg?height=40&width=40"
        ),
        Complaint(
            id = "4",
            studentName = "Ayesha Malik",
            date = "2024-01-12",
            title = "Garbage Collection",
            description = "Garbage bins are overflowing in the cafeteria area. Need immediate cleaning service.",
            category = "Cleanliness",
            status = "In Progress",
            imageUrl = "/placeholder.svg?height=60&width=60",
            profileImageUrl = "/placeholder.svg?height=40&width=40"
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xFFE91E63).copy(alpha = 0.1f)
            )
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Header Section
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color(0xFFE91E63),
                        shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp)
                    )
                    .padding(16.dp)
            ) {

                IconButton(
                    onClick = { /* Handle logout */ },
                    modifier = Modifier.align(Alignment.TopEnd)
                ) {
                    Icon(
                        imageVector = Icons.Default.ExitToApp,
                        contentDescription = "Logout",
                        tint = Color.White
                    )
                }


                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Profile Image
                    AsyncImage(
                        model = "/placeholder.svg?height=80&width=80",
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(Color.White),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Muhammad Imran",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Text(
                        text = "Student ID: 12345",
                        fontSize = 14.sp,
                        color = Color.White.copy(alpha = 0.9f)
                    )

                    Text(
                        text = "Private",
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.8f)
                    )

                    Text(
                        text = "Degree Course",
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.8f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))


            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column {
                    // Tab Row
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        // Map Tab
                        TextButton(
                            onClick = { selectedTab = 0 },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = if (selectedTab == 0) Color(0xFFE91E63) else Color.Gray
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.Place,
                                contentDescription = "Map",
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("Map")
                        }

                        // Complaints Tab
                        TextButton(
                            onClick = { selectedTab = 1 },
                            modifier = Modifier.weight(1f),
                            colors = ButtonDefaults.textButtonColors(
                                contentColor = if (selectedTab == 1) Color(0xFFE91E63) else Color.Gray
                            )
                        ) {
                            Text("My Complaints")
                        }
                    }

                    Divider(color = Color.Gray.copy(alpha = 0.2f))

                    // Tab Content
                    when (selectedTab) {
                        0 -> {

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                   ,
                                contentAlignment = Alignment.Center
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Place,
                                        contentDescription = "Map",
                                        modifier = Modifier.size(64.dp),
                                        tint = Color.Gray
                                    )
                                    Spacer(modifier = Modifier.height(16.dp))
                                    Text(
                                        text = "Map View",
                                        fontSize = 18.sp,
                                        color = Color.Gray
                                    )
                                    Text(
                                        text = "Coming Soon",
                                        fontSize = 14.sp,
                                        color = Color.Gray
                                    )
                                }
                            }
                        }
                        1 -> {
                            // Complaints List
                            LazyColumn(
                                modifier = Modifier.fillMaxHeight(1f),
                                contentPadding = PaddingValues(16.dp),
                                verticalArrangement = Arrangement.spacedBy(12.dp)
                            ) {
                                items(sampleComplaints) { complaint ->
                                    ComplaintCard(complaint = complaint)
                                }
                            }
                        }
                    }
                }
            }
        }

        // Floating Action Button
        FloatingActionButton(
            onClick = { /* Navigate to add complaint */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp),
            containerColor = Color(0xFFE91E63)
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add Complaint",
                tint = Color.White
            )
        }
    }
}

@Composable
fun ComplaintCard(complaint: Complaint) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            // Profile Image
            AsyncImage(
                model = complaint.profileImageUrl,
                contentDescription = "Profile",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(Color.Gray.copy(alpha = 0.2f)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(12.dp))

            // Content
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top
                ) {
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = complaint.studentName,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.Black
                        )
                        Text(
                            text = complaint.date,
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }

                    IconButton(
                        onClick = { /* Show menu */ },
                        modifier = Modifier.size(24.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.MoreVert,
                            contentDescription = "More options",
                            tint = Color.Gray,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = complaint.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black
                )

                Text(
                    text = complaint.description,
                    fontSize = 14.sp,
                    color = Color.Gray,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(vertical = 4.dp)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column {
                        Text(
                            text = "Category: ${complaint.category}",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )

                        // Status Badge
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = when (complaint.status) {
                                "Resolved" -> Color.Green.copy(alpha = 0.1f)
                                "In Progress" -> Color.Red.copy(alpha = 0.1f)
                                else -> Color.Red.copy(alpha = 0.1f)
                            },
                            modifier = Modifier.padding(top = 4.dp)
                        ) {
                            Text(
                                text = complaint.status,
                                fontSize = 10.sp,
                                color = when (complaint.status) {
                                    "Resolved" -> Color.Green
                                    "In Progress" -> Color.Red
                                    else -> Color.Red
                                },
                                modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
                            )
                        }
                    }

                    // Complaint Image
                    AsyncImage(
                        model = complaint.imageUrl,
                        contentDescription = "Complaint Image",
                        modifier = Modifier
                            .size(60.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.Gray.copy(alpha = 0.2f)),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}