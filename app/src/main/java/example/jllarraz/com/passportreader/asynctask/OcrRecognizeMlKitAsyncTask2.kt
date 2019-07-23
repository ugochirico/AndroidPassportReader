/*
 * Copyright 2011 Robert Theis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.jllarraz.com.passportreader.asynctask

import android.content.Context
import android.os.AsyncTask

import example.jllarraz.com.passportreader.mlkit.VisionImageProcessor
import example.jllarraz.com.passportreader.mlkit.VisionProcessorBase
import io.fotoapparat.preview.Frame

class OcrRecognizeMlKitAsyncTask2(private val context: Context,
                                  private val frameProcessor: VisionImageProcessor,
                                  private val frame: Frame,
                                  private val ocrListener: VisionProcessorBase.OcrListener) : AsyncTask<Void, Void, Boolean>() {

    override fun doInBackground(vararg arg0: Void): Boolean {
        frameProcessor.process(frame, ocrListener)
        return true
    }

}