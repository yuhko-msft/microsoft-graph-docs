---
title: "Update groupPolicyPresentationValueList"
description: "Update the properties of a groupPolicyPresentationValueList object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update groupPolicyPresentationValueList
Namespace: microsoft.graph

Update the properties of a [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.

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
PATCH ** Entity URI for microsoft.graph.groupPolicyPresentationValueList not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object.

The following table shows the properties that are required when you create the [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [groupPolicyPresentationValue](../resources/intune-grouppolicypresentationvalue.md)|
|values|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [groupPolicyPresentationValueList](../resources/intune-grouppolicypresentationvaluelist.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_grouppolicypresentationvaluelist"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.groupPolicyPresentationValueList not found
Content-Type: application/json
Content-length: 162

{
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueList",
  "values": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
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
  "@odata.type": "#microsoft.graph.groupPolicyPresentationValueList",
  "id": "77a4f4cd-f4cd-77a4-cdf4-a477cdf4a477",
  "lastModifiedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "values": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

