---
title: "Create groupPolicyPresentationDecimalTextBox"
description: "Create a new groupPolicyPresentationDecimalTextBox object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create groupPolicyPresentationDecimalTextBox
Namespace: microsoft.graph

Create a new [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.

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
POST ** Collection URI for microsoft.graph.groupPolicyPresentationDecimalTextBox not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object.

The following table shows the properties that are required when you create the [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md).

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

If successful, this method returns a `201 Created` response code and a [groupPolicyPresentationDecimalTextBox](../resources/grouppolicypresentationdecimaltextbox.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_grouppolicypresentationdecimaltextbox_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.groupPolicyPresentationDecimalTextBox not found
Content-Type: application/json
Content-length: 257

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationDecimalTextBox",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.groupPolicyPresentationDecimalTextBox"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationDecimalTextBox",
  "id": "d3004a10-4a10-d300-104a-00d3104a00d3",
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

