/* Copyright (C) 2021 Reinhardt Wenzina

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.
*/

package tc09;

import common.SubAPACHEBSD;
import utils.de.SubUTILS;

public class MainAPACHE {
    public static void main(String[] args) {
        SubAPACHEBSD s = new SubAPACHEBSD();
        s.sayHello();
        SubUTILS t = new SubUTILS();
        t.sayHello();
        System.out.println("de.tdosca.tc09.Main: 'Hello!'.");
    }
}
