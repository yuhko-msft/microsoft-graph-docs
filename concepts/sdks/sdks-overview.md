---
title: "Microsoft Graph SDKs overview"
description: "Describes the SDKs that are available, the platforms they support, and the value they provide to developers."
ms.localizationpriority: medium
author: MichaelMainer
ms.custom: scenarios:getting-started
---

# Microsoft Graph SDKs overview

The Microsoft Graph SDKs are designed to simplify building high-quality, efficient, and resilient applications that access Microsoft Graph. The SDKs include two components: a service library and a core library.

The service library contains models and request builders that are generated from Microsoft Graph metadata to provide a rich, strongly typed, and discoverable experience when working with the many datasets available in Microsoft Graph.

The core library provides a set of features that enhance working with all the Microsoft Graph services. Embedded support for retry handling, secure redirects, transparent authentication, and payload compression, improve the quality of your application's interactions with Microsoft Graph, with no added complexity, while leaving you completely in control. The core library also provides support for common tasks such as paging through collections and creating batch requests.

## Supported platforms

SDKs are currently available for the following languages and platforms:

- [Android](https://developer.microsoft.com/en-us/graph/get-started/android)
- [Angular](https://developer.microsoft.com/en-us/graph/get-started/angular)
- [ASP.NET](https://developer.microsoft.com/en-us/graph/get-started/asp.net)
- [Go (PREVIEW)](https://github.com/microsoftgraph/msgraph-sdk-go)
- [iOS](https://developer.microsoft.com/en-us/graph/get-started/ios)
- [Javascript](https://developer.microsoft.com/en-us/graph/get-started/javascript)
- [Node.js](https://developer.microsoft.com/en-us/graph/get-started/node.js)
- [Java](https://developer.microsoft.com/en-us/graph/get-started/java)
- [PHP](https://developer.microsoft.com/en-us/graph/get-started/php)
- [PowerShell](/graph/powershell/get-started)
- [Python](https://developer.microsoft.com/en-us/graph/get-started/python)

## Microsoft 365 developer subscription

When building applications using Microsoft Graph, we recommend that you get a free Microsoft 365 developer subscription by signing up for the [Microsoft 365 Developer Program](https://developer.microsoft.com/microsoft-365/dev-program).

## See also

The SDK [design requirements documentation](https://github.com/microsoftgraph/msgraph-sdk-design) provides more details about the features and capabilities of the SDK. Request or vote on additional features at the [Microsoft 365 Developer Platform ideas forum](https://techcommunity.microsoft.com/t5/microsoft-365-developer-platform/idb-p/Microsoft365DeveloperPlatform/label-name/Microsoft%20Graph). For a list of SDKs and samples for Microsoft Graph, see the [Microsoft Graph resources page](https://developer.microsoft.com/en-us/graph/gallery/?filterBy=Samples,SDKs).
