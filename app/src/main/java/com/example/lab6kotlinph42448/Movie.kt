package com.example.lab6kotlinph42448

data class Movie(
    val title: String,
    val year: String,
    val posterUrl: String,
    val duration: String,
    val releaseDate: String,
    val genre: String,
    val shotDescription: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie(
                title = "The Shawshank Redemption",
                year = "1994",
                posterUrl="https://tailieutienganh.edu.vn/public/files/upload/default/images/FILM-3.jpg",
                duration = "142 min",
                releaseDate = "September 23, 1994",
                genre = "Drama",
                shotDescription = "Two imprisoned men bond over a number of years, finding solace and eventual redemption in their friendship."
            ),
            Movie(
                title = "The Godfather",
                year = "1972",
                posterUrl = "https://afamilycdn.com/150157425591193600/2023/5/11/0510-1683821676462-1683821676619649713248.jpg", // Replace with actual poster URL
                duration = "175 min",
                releaseDate = "March 24, 1972",
                genre = "Crime Drama",
                shotDescription = "The story of the Corleone family under patriarch Vito Corleone, focusing on the transformation of his youngest son, Michael, from reluctant family outsider to ruthless mafia boss."
            ),
            Movie(
                title = "The Dark Knight",
                year = "2008",
                posterUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9Oi6Oav3U0XfS15gZUDHAcl4v_Nbwc5xqTA&s", // Replace with actual poster URL
                duration = "152 min",
                releaseDate = "July 18, 2008",
                genre = "Crime Drama, Superhero",
                shotDescription = "As Batman races to stop the Joker from unleashing anarchy onto Gotham City, he is forced to confront his own personal demons."
            ),
            Movie(
                title = "The Lord of the Rings: The Return of the King",
                year = "2003",
                posterUrl ="https://dcine.vn/Areas/Admin/Content/Fileuploads/images/POSTER/doraemon2024.jpg",
                duration = "201 min",
                releaseDate = "December 17, 2003",
                genre = "Adventure, Drama, Fantasy",
                shotDescription = "Frodo and the Fellowship journey to Mordor to destroy the One Ring and end Sauron's reign of darkness."
            ),
            Movie(
                title = "Schindler's List",
                year = "1993",
                posterUrl = "https://afamilycdn.com/150157425591193600/2023/5/11/0320-1683821673129-16838216733621992543848.jpg",
                duration = "195 min",
                releaseDate = "December 15, 1993",
                genre = "Biography, Drama, History",
                shotDescription = "The true story of Oskar Schindler, a German businessman who saved the lives of over a thousand Jews during the Holocaust."
            )
        )
    }
}
