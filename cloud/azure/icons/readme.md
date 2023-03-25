# Azure icons

* ``svg`` - SVG icons downloaded from https://learn.microsoft.com/en-us/azure/architecture/icons/. 
* ``font`` - the above icons converted to a font with https://icomoon.io. Please note that the font is multi-color it requires multiple spans.
* ``png`` - SVG icons converted to PNG

Please reference icons using jsDelivr URL:

* SVG - use this page to get jsDelivr URL: https://www.jsdelivr.com/github
* Font - Add ``https://cdn.jsdelivr.net/gh/Nasdanika/architecture@main/cloud/azure/icons/style.css`` stylesheet to pages using the font

Terms - by using these icons you are agreeing these [terms](svg/icons/Microsoft_Terms_of_Use.pdf)

## Font and PNG generation

* Upload SVG's to icomoon
* Download a set as JSON and add to this repo
* Rename icons in the set - replace ``icon-...`` prefix with the set-specific prefix, e.g. ``compute-``
* Rename icons as needed
* Remove the original set
* Import the set
* Download project and save it here
* In font generation settings remove class prefix, set font class to ``nsd-azure``
* Generate font, download, extract, delete ``fonts`` folder in this repository and then copy the extracted ``fonts`` folder here as well as ``style.css``
* Generate PNG/SVG, download, extract, copy PNG's to the ``png`` folder


## Font use

