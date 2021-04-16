---
title: "Create sensitivityLabel"
description: "Create a new sensitivityLabel object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sensitivityLabel
Namespace: microsoft.graph



Create a new [sensitivityLabel](../resources/sensitivitylabel.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /dataClassification/sensitivityLabels
POST /me/informationProtection/sensitivityLabels
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sensitivityLabel](../resources/sensitivitylabel.md) object.

The following table shows the properties that are required when you create the [sensitivityLabel](../resources/sensitivitylabel.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|applicableTo|sensitivityLabelTarget|**TODO: Add Description**. Possible values are: `email`, `site`, `unifiedGroup`, `unknownFutureValue`.|
|applicationMode|applicationMode|**TODO: Add Description**. Possible values are: `manual`, `automatic`, `recommended`.|
|assignedPolicies|[labelPolicy](../resources/labelpolicy.md) collection|**TODO: Add Description**|
|autoLabeling|[autoLabeling](../resources/autolabeling.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isDefault|Boolean|**TODO: Add Description**|
|isEndpointProtectionEnabled|Boolean|**TODO: Add Description**|
|labelActions|[labelActionBase](../resources/labelactionbase.md) collection|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|priority|Int32|**TODO: Add Description**|
|toolTip|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [sensitivityLabel](../resources/sensitivitylabel.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sensitivitylabel_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/sensitivityLabels
Content-Type: application/json
Content-length: 584

{
  "@odata.type": "#microsoft.graph.sensitivityLabel",
  "applicableTo": "String",
  "applicationMode": "String",
  "assignedPolicies": [
    {
      "@odata.type": "microsoft.graph.labelPolicy"
    }
  ],
  "autoLabeling": {
    "@odata.type": "microsoft.graph.autoLabeling"
  },
  "description": "String",
  "displayName": "String",
  "isDefault": "Boolean",
  "isEndpointProtectionEnabled": "Boolean",
  "labelActions": [
    {
      "@odata.type": "microsoft.graph.addFooter"
    }
  ],
  "name": "String",
  "priority": "Integer",
  "toolTip": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sensitivityLabel"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.sensitivityLabel",
  "id": "c9fdd4d9-d4d9-c9fd-d9d4-fdc9d9d4fdc9",
  "applicableTo": "String",
  "applicationMode": "String",
  "assignedPolicies": [
    {
      "@odata.type": "microsoft.graph.labelPolicy"
    }
  ],
  "autoLabeling": {
    "@odata.type": "microsoft.graph.autoLabeling"
  },
  "description": "String",
  "displayName": "String",
  "isDefault": "Boolean",
  "isEndpointProtectionEnabled": "Boolean",
  "labelActions": [
    {
      "@odata.type": "microsoft.graph.addFooter"
    }
  ],
  "name": "String",
  "priority": "Integer",
  "toolTip": "String"
}
```

