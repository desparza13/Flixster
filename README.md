# Project 1 - *Flixster*

**Flixster** shows the latest movies currently playing in theaters. The app utilizes the Movie Database API to display images and basic information about these movies to the user.

Time spent: **x** hours spent in total

## User Stories

The following **required** functionality is completed:

* [✔] User can **scroll through current movies** from the Movie Database API
* 
![scrollThrough](https://user-images.githubusercontent.com/56266109/171963893-673c7a9e-7e92-4645-a2c2-db95061a828a.gif)

* [✔] Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
*
![placeholder](https://user-images.githubusercontent.com/56266109/171964734-55615eac-2d70-49f2-9fa1-5d94ada2015f.gif)

* [✔] For each movie displayed, user can see the following details:
  * [✔] Title, Poster Image, Overview (Portrait mode)
  * [✔] Title, Backdrop Image, Overview (Landscape mode)
  * ![landscapePortrait](https://user-images.githubusercontent.com/56266109/171964913-9163c3f4-95c2-46d6-b2fe-bfa16414c9c5.gif)

* [✔] Allow user to view details of the movie including ratings within a separate activity
![details](https://user-images.githubusercontent.com/56266109/171965085-3f62b5ff-8e55-4f85-be84-d6025f68f25b.gif)

The following **stretch** features are implemented:

* [✔] Improved the user interface by experimenting with styling and coloring.
* [✔] Apply rounded corners for the poster or background images using [Glide transformations](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#transformations)
* [ ] Apply the popular [View Binding annotation library](http://guides.codepath.org/android/Reducing-View-Boilerplate-with-ViewBinding) to reduce boilerplate code.
* [ ] Allow video trailers to be played in full-screen using the YouTubePlayerView from the details screen.

The following **additional** features are implemented:
 
* [ ] List anything else that you can get done to improve the app functionality!
* [ ] Infinite scrolling
* [ ] Wikipedia link to the movie

## Video Walkthrough

Here's a walkthrough of implemented user stories:
![walkthrough](https://user-images.githubusercontent.com/56266109/171965376-6f9a9c31-677c-4839-8f6e-53b2159eab22.gif)

<img src='http://i.imgur.com/link/to/your/gif/file.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with [Kap](https://getkap.co/).

## Notes

While trying to create the view binding my Android Studio didn't detect the library, also while creating the youtube stretch feature I struggled with creating a new view for it, which is why I didn't finish that stretch features.
Out of the core features the part I struggled the most was regarding view creation and intents.
## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright 2022 Daniela Esparza Espinosa

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
