package ir.alirezanazari.newsapi.data.db.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey
import ir.alirezanazari.newsapi.internal.Constants.DB.ARTICLES_TABLE
import java.time.LocalDateTime

@Entity(tableName = ARTICLES_TABLE, indices = [Index(value = ["addedDate"], unique = true)])
data class ArticleEntity (
    val source: String,
    val author: String?= null,
    val title: String,
    val description: String,
    val url: String,
    val image: String,
    val publishedDate: String,
    val content: String ,
    val addedDate: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int ?= null
)