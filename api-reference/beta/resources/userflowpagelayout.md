---
title: "userFlowPageLayout resource type"
description: "Representation of identity user flow page layout, as is shown in Azure portal in "Azure AD B2C" > "User flows" > {USERFLOW} > "Page Layouts". The amount of page layouts can be modified, only the present set of entities allows updated for "pageUri" and "version"."
author: "almars"
ms.localizationpriority: medium
ms.prod: "identity-and-sign-in"
doc_type: resourcePageType
---

# userFlowPageLayout resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userFlowPageLayouts](../api/userflowpagelayout-list.md)|[userFlowPageLayout](../resources/userflowpagelayout.md) collection|Get a list of the [userFlowPageLayout](../resources/userflowpagelayout.md) objects and their properties.|
|[Create userFlowPageLayout](../api/b2cidentityuserflow-post-pagelayouts.md)|[userFlowPageLayout](../resources/userflowpagelayout.md)|Create a new [userFlowPageLayout](../resources/userflowpagelayout.md) object.|
|[Get userFlowPageLayout](../api/userflowpagelayout-get.md)|[userFlowPageLayout](../resources/userflowpagelayout.md)|Read the properties and relationships of a [userFlowPageLayout](../resources/userflowpagelayout.md) object.|
|[Update userFlowPageLayout](../api/userflowpagelayout-update.md)|[userFlowPageLayout](../resources/userflowpagelayout.md)|Update the properties of a [userFlowPageLayout](../resources/userflowpagelayout.md) object.|
|[Delete userFlowPageLayout](../api/userflowpagelayout-delete.md)|None|Deletes a [userFlowPageLayout](../resources/userflowpagelayout.md) object.|
|[availableVersions](../api/userflowpagelayout-availableversions.md)|String collection|**TODO: Add Description**|
|[restoreDefaultPageUri](../api/userflowpagelayout-restoredefaultpageuri.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|isCustomPageUri|Boolean|**TODO: Add Description**|
|pageUri|String|**TODO: Add Description**|
|version|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userFlowPageLayout",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userFlowPageLayout",
  "id": "String (identifier)",
  "displayName": "String",
  "isCustomPageUri": "Boolean",
  "pageUri": "String",
  "version": "String"
}
```

