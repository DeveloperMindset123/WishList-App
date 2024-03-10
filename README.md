# Android Project 2 - *Wishlist-App*

Submitted by: **Ayan Das**

**Name of your app** is a wishlist app that helps the user keep track of what they want to buy.

Time spent: **15** hours spent in total

## Required Features

The following **required** functionality is completed:

- [x] **User can add an item to their wishlist**
- [x] **User can see their list of items based on previously inputted items**

The following **optional** features are implemented:

- [x] Wishlist app is 🎨 **customized** 🎨
- [ ] User can delete an item by long pressing on the item
- [x] User can open an item's URL by clicking on the item

The following **additional** features are implemented:

* [x] Change text color when Button is pressed, added a refresh element.

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExbThhYzdqd2M4d2RubndlZGs0Z2ZkeWdueHByd2w0dmg0bDhwbHF4aiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/jTQ8soh0I2SlA0K8w0/giphy.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<!-- Replace this with whatever GIF tool you used! -->
GIF created with ...  
[Kap](https://getkap.co/) for macOS
<!-- Recommended tools:
[Kap](https://getkap.co/) for macOS
[ScreenToGif](https://www.screentogif.com/) for Windows
[peek](https://github.com/phw/peek) for Linux. -->

## Notes

Aligning the EditText views and also figuring out how to replace URL links with a placeholder text, links wasn't initially working and internet sources were telling me to set Android:autoLink="all" and android:clickable="true" will fix it but it was interfering with the spannable and URL span logic that I defined in my onBindViewHolder. Nonetheless, it was a good way for me to learn about Recycler View and I enjoyed it.

## License

    Copyright [yyyy] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
