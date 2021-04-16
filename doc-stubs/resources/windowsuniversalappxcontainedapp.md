---
title: "windowsUniversalAppXContainedApp resource type"
description: "A class that represents a contained app of a WindowsUniversalAppX app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsUniversalAppXContainedApp resource type

Namespace: microsoft.graph



A class that represents a contained app of a WindowsUniversalAppX app.


Inherits from [mobileContainedApp](../resources/mobilecontainedapp.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsUniversalAppXContainedApps](../api/windowsuniversalappxcontainedapp-list.md)|[windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) collection|Get a list of the [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) objects and their properties.|
|[Create windowsUniversalAppXContainedApp](../api/windowsuniversalappxcontainedapp-create.md)|[windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md)|Create a new [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object.|
|[Get windowsUniversalAppXContainedApp](../api/windowsuniversalappxcontainedapp-get.md)|[windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md)|Read the properties and relationships of a [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object.|
|[Update windowsUniversalAppXContainedApp](../api/windowsuniversalappxcontainedapp-update.md)|[windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md)|Update the properties of a [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object.|
|[Delete windowsUniversalAppXContainedApp](../api/windowsuniversalappxcontainedapp-delete.md)|None|Deletes a [windowsUniversalAppXContainedApp](../resources/windowsuniversalappxcontainedapp.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appUserModelId|String|The app user model ID of the contained app of a WindowsUniversalAppX app.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUniversalAppXContainedApp",
  "baseType": "microsoft.graph.mobileContainedApp",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUniversalAppXContainedApp",
  "id": "String (identifier)",
  "appUserModelId": "String"
}
```

