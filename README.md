#  Greek vocative name

Greek vocative name for Android is a Kotlin library for transforming Greek name to its vocative case/form. It has no effect on English or other languages.

## Installation

Use gradle or maven

### gradle
```bash
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
	        implementation 'com.github.Desquared:Greek-vocative-name-Android:1.0.2'
	}
```

### maven
```bash
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependency>
	    <groupId>com.github.Desquared</groupId>
	    <artifactId>Greek-vocative-name-Android</artifactId>
	    <version>1.0.2</version>
	</dependency>


```
## Usage

```kotlin
import gr.desquared.vocativename.VocativeUtils

Log.d("Vocative", VocativeUtils.getVocativeName("Χαράλαμπος")) // Χαράλαμπε
Log.d("Vocative", VocativeUtils.getVocativeName("ΜΑΡΙΑ")) // Μαρια
Log.d("Vocative", VocativeUtils.getVocativeName("αλέξανδρος")) // Αλέξανδρε
Log.d("Vocative", VocativeUtils.getVocativeName("john")) // John
```

## License
Copyright [2020] Desquared

Licensed under the Apache License, Version 2.0 (the "License");

you may not use this file except in compliance with the License.

You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software

distributed under the License is distributed on an "AS IS" BASIS,

WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

See the License for the specific language governing permissions and

limitations under the License.
