---
title: "Update groupPolicyPresentationLongDecimalTextBox"
description: "Update the properties of a groupPolicyPresentationLongDecimalTextBox object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationLongDecimalTextBox
Namespace: microsoft.graph

Update the properties of a [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH ** Entity URI for microsoft.graph.groupPolicyPresentationLongDecimalTextBox not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object.

The following table shows the properties that are required when you create the [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|label|String|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentation](../resources/intune-grouppolicypresentation.md)|
|defaultValue|Int64|**TODO: Add Description**|
|spin|Boolean|**TODO: Add Description**|
|spinStep|Int64|**TODO: Add Description**|
|required|Boolean|**TODO: Add Description**|
|minValue|Int64|**TODO: Add Description**|
|maxValue|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationLongDecimalTextBox](../resources/grouppolicypresentationlongdecimaltextbox.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationlongdecimaltextbox"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.groupPolicyPresentationLongDecimalTextBox not found
Content-Type: application/json
Content-length: 261

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationLongDecimalTextBox",
  "label": "String",
  "defaultValue": "Integer",
  "spin": "Boolean",
  "spinStep": "Integer",
  "required": "Boolean",
  "minValue": "Integer",
  "maxValue": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationLongDecimalTextBox",
  "id": "ce5b1cf4-1cf4-ce5b-f41c-5bcef41c5bce",
  "label": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "defaultValue": "Integer",
  "spin": "Boolean",
  "spinStep": "Integer",
  "required": "Boolean",
  "minValue": "Integer",
  "maxValue": "Integer"
}
```

